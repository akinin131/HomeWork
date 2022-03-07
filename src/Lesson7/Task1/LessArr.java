package Lesson7.Task1;

public class LessArr {
 int [] lessArr;
    public LessArr(int[] lessArr) {setLessArr(lessArr);}
    public void setLessArr(int[] lessArr) {
        this.lessArr = lessArr;}
    public void arre1(){
        for (int i = 0; i < lessArr.length-1; i++) {
            if (lessArr[i]<lessArr[i+1]) {
                throw new IllegalArgumentException("Массив расположен не в порядке убывания");
            }
        }
        System.out.println("Массив расположен в порядке убывния");
    }
}
