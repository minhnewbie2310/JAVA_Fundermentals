/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws7;

/**
 *
 * @author User
 */
public class RightTriangle {

    int a, b, c;

    public RightTriangle(int a, int b, int c) throws IllegalTriangleException,IllegalRightTriangleException{
        this.a = a;
        this.b = b;
        this.c = c;
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("This is not a triangle !");
        }
        else if (a * a != b * b + c * c && a * a + b * b != c * c && a * a + c * c != b * b ) {
            throw new IllegalRightTriangleException("This is not a right triangle !");
        }
        
    }

    class IllegalTriangleException extends Exception {

        public IllegalTriangleException(String mes) {

            super(mes);
        }
    }

    class IllegalRightTriangleException extends Exception {

        public IllegalRightTriangleException(String mes) {

            super(mes);
        }
    }
}
