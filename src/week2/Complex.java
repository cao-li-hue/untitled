package week2;

public class Complex {


    double real, image;//实部和虚部

    Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    Complex add(Complex c) {
        c.real = this.real + c.real;
        c.image = this.image + c.image;
        return c;
    }//加法

    Complex sub(Complex c) {
        c.real = this.real - c.real;
        c.image = this.image - c.image;
        return c;
    }//减法

    Complex mul(Complex c) {
        c.real = this.real * c.real - this.image * c.image;
        c.image = this.real * c.image + this.image * c.real;
        return c;
    }

    public static void main(String args[]) {
        Complex c = new Complex(1, 2);
        Complex v = new Complex(3, 4);
        System.out.println(c.real + " + " + c.image + "i");
        System.out.println("加");
        System.out.println(v.real + " + " + v.image + "i");
        c.add(v);
        System.out.println("等于");
        System.out.println(v.real + " + " + v.image + "i");
        System.out.println();

        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        System.out.println(a.real + " + " + a.image + "i");
        System.out.println("减");
        System.out.println(b.real + " + " + b.image + "i");
        a.sub(b);
        System.out.println("等于");
        System.out.println(b.real + " + " + b.image + "i");
        System.out.println();

        Complex d = new Complex(1, 2);
        Complex f = new Complex(3, 4);
        System.out.println(d.real + " + " + d.image + "i");
        System.out.println("乘");
        System.out.println(f.real + " + " + f.image + "i");
        d.mul(f);
        System.out.println("等于");
        System.out.println(f.real + " + " + f.image + "i");
    }
}
