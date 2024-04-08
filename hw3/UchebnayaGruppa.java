class UchebnayaGruppa {
    private String nazvanie;
    private int StudNumb;

    public UchebnayaGruppa(String nazvanie, int StudNumb) {
        this.nazvanie = nazvanie;
        this.StudNumb = StudNumb;
    }

    public int getStudNumb() {
        return StudNumb;
    }

    @Override
    public String toString() {
        return "Группа: " + nazvanie + ", Количество студентов: " + StudNumb;
    }
}