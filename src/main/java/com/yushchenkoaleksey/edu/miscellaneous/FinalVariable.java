package com.yushchenkoaleksey.edu.miscellaneous;

public class FinalVariable {

    public int finalValueAfterOperations(String[] operations) {
        var x = 0;
        for (String operation : operations){
            if (operation.charAt(1) == '+'){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }

}
