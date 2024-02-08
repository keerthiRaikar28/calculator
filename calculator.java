class calculator{
    float addition(float operand_1,float operand_2){
        return(operand_1 + operand_2);
    }
    float subtraction(float operand_1,float operand_2){
    return(operand_1 - operand_2);
    }
    float mutiplication(float operand_1,float operand_2){
        return(operand_1 * operand_2);
        }
        /**
         * The function division takes two float operands and returns their division result.
         * 
         * @param operand_1 The first operand of the division operation. It can be any floating-point
         * number.
         * @param operand_2 The second operand in the division operation.
         * @return the result of dividing operand_1 by operand_2.
         */
        float division(float operand_1,float operand_2){
            return(operand_1 / operand_2);
            }
        float square(float operand){
            return (operand*operand);
           }
           float cube(float operand){
            return (operand*operand*operand);
           }

            public static void main(String[] args) {
                float operand_1 = 10;
                float operand_2 = 5;
                float  operand = 2;
                calculator calc  = new calculator();
                float add_result = calc.addition(operand_1, operand_2);
                System.out.println("result of addition is:" + add_result );
                float sub_result = calc.subtraction(operand_1, operand_2);
                System.out.println("result of subtraction is:" + sub_result );
                float mul_result = calc.mutiplication(operand_1, operand_2);
                System.out.println("result of multiplication is:" + mul_result );
                float div_result = calc.division(operand_1, operand_2);
                System.out.println("result of division is:" + div_result );
                float sq_result = calc.square(operand);
                System.out.println("result of square is:" + sq_result );
                float cube_result = calc.cube(operand);
                System.out.println("result of cube is:" + cube_result );
            }
}