public class DE160046_NguyenDacHoangNghia_tongNSoLe {
    static int f(int n){
        if(n==1){
            return 1;
        }
          return n= n*2-1+(f(n-1));
        
    }


    public static void main(String[] args) {
        System.out.println(f(3));
    }

}
