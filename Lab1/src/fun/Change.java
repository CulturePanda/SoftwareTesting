
public class Change {
	
	static int num_50 = 1,num_20 = 1,num_5 = 2,num_1 = 3;
	
	public static boolean canTakeOut(int x) {
		int sum = 50*num_50 + 20*num_20 + 5*num_5 + 1*num_1;
		int remain = x,temp = 0;//remain为还需要多少钱 ，temp为理想情况下针对某时remian要拿出多少张面值为当前使用面值的货币
		if(x>sum) {return false;}//x大于钱的总数，无论如何不能凑出
		else{ //x小于总数，可能凑出
			temp = x/50;
			if(temp <= num_50) {
				remain = remain - 50*temp;//已经找出了50*temp元，所以还剩remian要找
			}else {
				remain = remain - 50*num_50;//当前所拥有的50面额货币数不满足理想值，只能把所有的都用了，以期在之后用小面额代替
			}
			temp = remain/20;
			if(temp <= num_20) {
				remain = remain - 20*temp;
			}else {
				remain = remain - 20*num_20;
			}
			temp = remain/5;
			if(temp <= num_5) {
				remain = remain - 5*temp;
			}else {
				remain = remain - 5*num_5;
			}
			temp = remain/1;
			if(temp <= num_1) {
				return true;
			}
			else 
				return false;//没有比1元再小的面额了，1元不够的话就没办法找开了
		}
	}
	
	public static void main(String[] args) {
		
	}

}
