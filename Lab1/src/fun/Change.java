
public class Change {
	
	static int num_50 = 1,num_20 = 1,num_5 = 2,num_1 = 3;
	
	public static boolean canTakeOut(int x) {
		int sum = 50*num_50 + 20*num_20 + 5*num_5 + 1*num_1;
		int remain = x,temp = 0;//remainΪ����Ҫ����Ǯ ��tempΪ������������ĳʱremianҪ�ó���������ֵΪ��ǰʹ����ֵ�Ļ���
		if(x>sum) {return false;}//x����Ǯ��������������β��ܴճ�
		else{ //xС�����������ܴճ�
			temp = x/50;
			if(temp <= num_50) {
				remain = remain - 50*temp;//�Ѿ��ҳ���50*tempԪ�����Ի�ʣremianҪ��
			}else {
				remain = remain - 50*num_50;//��ǰ��ӵ�е�50������������������ֵ��ֻ�ܰ����еĶ����ˣ�������֮����С������
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
				return false;//û�б�1Ԫ��С������ˣ�1Ԫ�����Ļ���û�취�ҿ���
		}
	}
	
	public static void main(String[] args) {
		
	}

}
