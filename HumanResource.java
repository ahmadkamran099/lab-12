package lab_12;


import java.util.ArrayList;

public class HumanResource{

    Association[] resourse;
    ArrayList <Association> a=new ArrayList<>();



    public void add(Association resourse){
        a.add(resourse);
    /*for (int i=0;i< resourse.length;i++){
        if (resourse[i]==null){
            resourse[i]=resourse;
        }
    }*/

}
public boolean delete(Association b){
        a.remove(b);
       /* for(int i=0;i< resourse.length;i++){
            if(resourse[i].equals(b)){
                resourse[i]=null;
            }
        }*/
return true;
}
public void extend(){

        if(resourse==null){
            resourse=new Association[1];
        }else{
            for(int i=0;i< resourse.length;i++){
                resourse[i]=resourse[i+1];
            }

        }
}


}
