public enum Quarter {
    I(1),II(2),III(3),IV(4);


    private final int quarterCode;
    private Quarter(int quarterCode){
        this.quarterCode = quarterCode;
    }

    public int getQuarterCode(){
        return this.quarterCode;
    }
}
