package ConvertIntegerSystem;

import java.util.Stack;

public class ConvertIntegerSystem implements ConvertSystem {

    Stack<Integer> stack = new Stack<>();
    Stack<String> stackString = new Stack<>();

    @Override
    public String convertBinary(int number) {
        // StringBuilder binary = new StringBuilder();
        if (number == 0) return "0";
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }
        String result = " ";
        while (!stack.isEmpty()) {
            result += stack.pop();
            //binary.append(stack.pop());
        }
        return result;
//        return binary.toString();
    }

    @Override
    public String convertOctal(int number) {
        //StringBuilder octal = new StringBuilder();
        if (number == 0) return "0";
        while (number > 0) {
            stack.push(number % 8);
            number /= 8;
        }
        String resultOctal = " ";
        while (!stack.isEmpty()) {
            resultOctal += stack.pop();
            //octal.append(stack.pop());
        }
        return resultOctal;
        //return octal.toString();
    }

    @Override
    public String convertHexadecimal(int number) {
        //StringBuilder hex = new StringBuilder();
        if (number == 0) return "0";
        //char[] hexChars = "0123456789ABCDEF".toCharArray();

        while (number > 0) {
            int residual = number % 16;
            switch (residual) {

                case 0:
                    stackString.push("0");
                    break;
                case 1:
                    stackString.push("1");
                    break;
                case 2:
                    stackString.push("2");
                    break;
                case 3:
                    stackString.push("3");
                    break;
                case 4:
                    stackString.push("4");
                    break;
                case 5:
                    stackString.push("5");
                    break;
                case 6:
                    stackString.push("6");
                    break;
                case 7:
                    stackString.push("7");
                    break;
                case 8:
                    stackString.push("8");
                    break;
                case 9:
                    stackString.push("9");
                    break;
                case 10:
                    stackString.push("A");
                    break;
                case 11:
                    stackString.push("B");
                    break;
                case 12:
                    stackString.push("C");
                    break;
                case 13:
                    stackString.push("D");
                    break;
                case 14:
                    stackString.push("E");
                    break;
                case 15:
                    stackString.push("F");
                    break;
                default:
                    stack.push(number % 16);
            }
            number /= 16;
        }
        String resultHexa = " ";
        while (!stackString.isEmpty()) {
            resultHexa += stackString.pop();
            //hex.append(hexChars[stack.pop()]);
        }
        return resultHexa;
        //return hex.toString();
    }

    @Override
    public String convertDecimal(int number) {
        return Integer.toString(number);
    }
}
