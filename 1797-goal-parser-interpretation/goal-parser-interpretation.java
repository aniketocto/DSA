class Solution {
    public String interpret(String command) {
        String cleanStr = command.replace("()", "o")
        .replace("(","")
        .replace(")","");
        // String str = "";
        // for(char ch: cleanStr.toCharArray())
        // {
        //     if(ch != '(' || ch != ')')
        //     {
        //         str += ch;
        //     }
        // }
        return cleanStr;
    }
}