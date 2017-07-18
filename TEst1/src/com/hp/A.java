package com.hp;

import java.rmi.UnexpectedException;
import java.util.ArrayList;

public class A {

	public static void main(String [] args) 
    {
        A x = new A();
        A x2 = m1(x); /* Line 6 */
        A x4 = new A();
        x2 = x4; /* Line 8 */
        //doComplexStuff();
    }
    static A m1(A mx) 
    {
        mx = new A();
        return mx;
    }
		
	}

