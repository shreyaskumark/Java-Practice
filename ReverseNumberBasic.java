class ReverseNumberBasic{
    public static void main(String[] args) {
        int n = 123;
        int copy = n;
        int reverse = 0;
        
        while(copy != 0){
            int num = copy % 10;
            reverse = reverse * 10 + num;
            copy /= 10;
        }
        System.out.println(reverse);
    }
}