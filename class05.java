/**
 * Created by Rushu on 5/14/2017.
 * operator
 */
public class class05 {
    /*Simple Assignment Operator

=       Simple assignment operator
Arithmetic Operators

+       Additive operator (also used
        for String concatenation)
-       Subtraction operator
*       Multiplication operator
/       Division operator
%       Remainder operator
Unary Operators

+       Unary plus operator; indicates
        positive value (numbers are
        positive without this, however)
-       Unary minus operator; negates
        an expression
++      Increment operator; increments
        a value by 1
--      Decrement operator; decrements
        a value by 1
!       Logical complement operator;
        inverts the value of a boolean
Equality and Relational Operators

==      Equal to
!=      Not equal to
>       Greater than
>=      Greater than or equal to
<       Less than
<=      Less than or equal to
Conditional Operators

&&      Conditional-AND
||      Conditional-OR
?:      Ternary (shorthand for
        if-then-else statement)
Type Comparison Operator

instanceof      Compares an object to
                a specified type
Bitwise and Bit Shift Operators

~       Unary bitwise complement
<<      Signed left shift
>>      Signed right shift
>>>     Unsigned right shift
&       Bitwise AND
^       Bitwise exclusive OR
|       Bitwise inclusive OR
    * */

    public static void main(String args []){

        int result = 3+9;
        System.out.println(result);

        result-=1;
        System.out.println(result);

        result*=result;
        System.out.println(result);

        result/=3;
        System.out.println(result);

        //reminder
        int oldResult = result;
        oldResult =oldResult % 3;
        System.out.println(oldResult);

        oldResult++;

        System.out.println(oldResult);

        if (oldResult == result){
            System.out.println(true);
        }else
            System.out.println(false);

        if (result<90 || result>80)
            System.out.println("Good");

        //ternary operator

        boolean example = false;


        boolean demo = example ? true:false ;
        if (demo)
            System.out.println("demo is true");
        else
            System.out.println(demo);


        //operator precedence

/*[]
.
()
++
--	access array element
access object member
invoke a method
post-increment
post-decrement	1	left to right
++
--
+
-
!
~	pre-increment
pre-decrement
unary plus
unary minus
logical NOT
bitwise NOT	2	right to left
()
new	cast
object creation	3	right to left
*
/
%	multiplicative	4	left to right
+ -
+	additive
string concatenation	5	left to right
<< >>
>>>	shift	6	left to right
<  <=
>  >=
instanceof	relational
type comparison	7	left to right
==
!=	equality	8	left to right
&	bitwise AND	9	left to right
^	bitwise XOR	10	left to right
|	bitwise OR	11	left to right
&&	conditional AND	12	left to right
||	conditional OR	13	left to right
?:	conditional	14	right to left
  =   +=   -=
 *=   /=   %=
 &=   ^=   |=
<<=  >>= >>>=
assignment	15	right to left
        * */






    }
}
