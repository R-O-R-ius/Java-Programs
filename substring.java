for(int i = 0;i<=s.length()-k;i++){

             String subString = s.substring(i,i+k);

             if(i == 0){

                 smallest = subString;

             }

             if(subString.compareTo(largest)>0){

                 largest = subString;

             }else if(subString.compareTo(smallest)<0)

                 smallest = subString;

      }
