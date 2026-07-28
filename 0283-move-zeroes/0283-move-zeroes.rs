impl Solution {
    pub fn move_zeroes(arr: &mut [i32]) {
    let mut i = 0;
    let mut j = 0;
    
    while j < arr.len() {
        if arr[j] != 0 {
            if j != i {
                arr.swap(i, j);
            }
            i += 1;
        }
        j += 1;
    }
}

}