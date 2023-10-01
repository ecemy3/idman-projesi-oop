public class idman {

    private int burpee_count;
    private int pushup_count;
    private int situp_count;
    private int squat_count;

    public idman(int burpee_count, int pushup_count, int situp_count, int squat_count) {
        this.burpee_count = burpee_count;
        this.pushup_count = pushup_count;
        this.situp_count = situp_count;
        this.squat_count = squat_count;
    }



    public int getBurpee_count() {
        return burpee_count;
    }

    public void setBurpee_count(int burpee_count) {
        this.burpee_count = burpee_count;
    }

    public int getPushup_count() {
        return pushup_count;
    }

    public void setPushup_count(int pushup_count) {
        this.pushup_count = pushup_count;
    }

    public int getSitup_count() {
        return situp_count;
    }

    public void setSitup_count(int situp_count) {
        this.situp_count = situp_count;
    }

    public int getSquat_count() {
        return squat_count;
    }

    public void setSquat_count(int squat_count) {
        this.squat_count = squat_count;
    }

    public void burpee_yap( int sayi)
    {
        if(burpee_count==0)
            System.out.println("yapacak burpee kalmadi");
        else if(burpee_count - sayi<0)
        {
            System.out.println("hareket hedefini gectin tebrikler");
        }
        else burpee_count -= sayi;
        {
            System.out.println("kalan burpee sayiniz:"+burpee_count);
        }
    }
    public void pushup_yap( int sayi)
    {
        if(pushup_count==0)
        {
            System.out.println("yapacak pushup kalmadi");

        }
        else if(pushup_count - sayi<0)
        {
            System.out.println("hareket hedefini gectin tebrikler");
        }
        else pushup_count -= sayi;
        {
            System.out.println("kalan pushup sayiniz:"+pushup_count);
        }
    }
    public void sithup_yap( int sayi )
    {
        if(situp_count==0)
        {
            System.out.println("yapacak situp kalmadi");

        }
        else if(situp_count - sayi<0)
        {
            System.out.println("hareket hedefini gectin tebrikler");
        }
        else

        {
            situp_count-= sayi ;
            System.out.println("kalan situp sayiniz:"+situp_count);
        }
    }
    public void squat_yap( int sayi )
    {
        if(squat_count==0)
        {
            System.out.println("yapacak squat kalmadi");

        }
        else if(squat_count - sayi<0)
        {
            System.out.println("hareket hedefini gectin tebrikler");
        }
        else
        {
            squat_count -= sayi;
            System.out.println("kalan squat sayiniz:"+squat_count);
        }
    }
    public void hareket_yap(String hareket_turu,int sayi)
    {
        if(hareket_turu.equals("burpee_count"))
        {
            burpee_yap(sayi);
        }
        else if (hareket_turu.equals("pushup_count"))
        {
            pushup_yap(sayi);
        }
         else if (hareket_turu.equals("situp_count"))
        {
            sithup_yap(sayi);
        }
         else if (hareket_turu.equals("squat_count"))
        {
            squat_yap(sayi);
        }
        else
        {
            System.out.println("gecersiz hareket");
        }
    }
public boolean idmanbitti_mi()
{
    return (burpee_count==0)&&(situp_count==0)&&(pushup_count==0)&&(squat_count==0);
}

}
