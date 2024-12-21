
public class Main {
    public static void main(String[] args) {
//задание 1
        System.out.println("Задание 1:");
        int[] array = {1,2,3,4,5,6,7,8,9};
        Expression expression = (n) -> n % 2 ==0;
        System.out.println("Сумма четных элементов списка равна: " + sumOfEven(array, expression));
//задание 2
        System.out.println('\n' + "Задание 2:");
        String [] arrayStr = {"Москва","Пермь","Самара","Новгород","Уфа"};
        LenMaxStr lenMaxStr = (n) -> n.length();
        System.out.println("Самое длинное слово в списке: " + maxStrEven(arrayStr, lenMaxStr));



    }
    public static int sumOfEven(int[] array, Expression exp){
        int result = 0;
        for (int element: array){
            if (exp.isEqual(element)){
                result += element;
            }
        }
        return result;
    }
    public static String maxStrEven(String[] array, LenMaxStr lenStr){
        String resultMaxStr = "";
        int maxPosition = 0;
        for (String elementStr: array){
            if (lenStr.isEqualStr(elementStr) > maxPosition){
                maxPosition = lenStr.isEqualStr(elementStr);
                resultMaxStr = elementStr;
            }
        }
        return resultMaxStr;
    }

}
interface Expression {
    boolean isEqual (int a);
}
interface LenMaxStr {
    int isEqualStr(String a);
}