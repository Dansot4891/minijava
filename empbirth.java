class date{
	int year,month,day;
	
	public date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public date(){
		
	}
	public String toString() {
		return year+"�� "+month+"�� "+day+"��";
	}
}
class employee{
	String name;
	date birthday = new date();
	
	public employee(String name, date birthday) {
		this.name = name;
		this.birthday = birthday;
	}
	
	public String toString() {
		return "�̸� : "+name+" "+birthday;
	}
}
public class empbirth {
	public static void main(String[] args) {
		date birth = new date(2000,7,24);
		employee woo = new employee("�Ӹ��",birth);
		
		System.out.println(woo);
	}
}
