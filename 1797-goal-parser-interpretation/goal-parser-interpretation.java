class Solution {
    public String interpret(String command) {
        // String cleanStr = command.replace("()", "o")
        // .replace("(","")
        // .replace(")","");

        StringBuilder str = new StringBuilder();
        int i = 0;
        while(i < command.length())
        {
            if(command.charAt(i) == 'G')
            {
                str.append("G");
            }
            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')')
            {   
                str.append("o");
                i++;
            }
            else
            {
                str.append("al");
                i+=3;
            }
            i++;
        }
        return str.toString();
    }
}