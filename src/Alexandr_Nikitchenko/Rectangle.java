package Alexandr_Nikitchenko;

/*
Собираем прямоугольник
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (верхняя координата, левая, ширина и высота).
Создать для него как можно больше методов initialize(…)

Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    public int top;
    public int left;
    public int width;
    public int height;


    public void initialize( int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize( int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize( int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize(Rectangle another){
        this.top = another.top;
        this.left = another.left;
        this.width = another.width;
        this.height = another.height;

    }

    public static void main(String[] args) {

    }
}
