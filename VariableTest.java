public class VariableTest{
        public static void main(String[]args){
                //一开始车上没有乘客
                int count = 0; 
                //第一站上来1个
                count = count + 1;
                //第二站下上来2个，下去1个
                count = count + 2 - 1;
                //第三站上来2个，下去1个
                count = count + 2 - 1;
                //第四站下来1个
                count = count - 1;
                //第五站上来1个
                count = count + 1;
                //请问：到了终点站，车上一共几位乘客？
                System.out.println(count);

                
        }
}