package login_app.models;

public class Profile {
    private String namaLengkap;
    private int umur;
    private String hobby;
    private String nickName;

    public Profile(){
    }

    public Profile(String namaLengkap , int umur , String hobby , String nickName){
        this.namaLengkap = namaLengkap;
        this.umur = umur;
        this.hobby = hobby;
        this.nickName = nickName;
    }

    public void setNamaLengkap(String namaLengkap){
        this.namaLengkap = namaLengkap;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public void setNickName(String nickName){
        this.nickName = nickName;
    }


    public String getNickName(){
        return nickName;
    }
    public String getNamaLengkap(){
        return namaLengkap;
    }
    public int getUmur(){
        return umur;
    }
    public String getHobby(){
        return hobby;
    }
}