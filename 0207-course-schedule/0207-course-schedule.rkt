(define/contract (can-finish numCourses prerequisites)
  (-> exact-integer? (listof (listof exact-integer?)) boolean?)
  (let* ([adj (make-vector numCourses '())]
         [indegree (make-vector numCourses 0)])
    
    ;; Build adjacency list and calculate in-degrees
    (for ([p prerequisites])
      (let ([course (first p)]
            [prereq (second p)])
        (vector-set! adj prereq (cons course (vector-ref adj prereq)))
        (vector-set! indegree course (+ 1 (vector-ref indegree course)))))
    
    ;; Initialize queue as an immutable set
    (define q (let loop ([i 0] [acc (set)])
                (if (= i numCourses)
                    acc
                    (loop (+ i 1) (if (= (vector-ref indegree i) 0)
                                      (set-add acc i)
                                      acc)))))
    
    ;; Process the queue using immutable sets
    (define (bfs queue count)
      (if (set-empty? queue)
          count
          (let* ([curr (set-first queue)]
                 [next-q (set-remove queue curr)])
            (define updated-next-q
              (for/fold ([acc next-q])
                        ([neighbor (vector-ref adj curr)])
                (let ([new-deg (- (vector-ref indegree neighbor) 1)])
                  (vector-set! indegree neighbor new-deg)
                  (if (= new-deg 0)
                      (set-add acc neighbor)
                      acc))))
            (bfs updated-next-q (+ count 1)))))
    
    (= (bfs q 0) numCourses)))