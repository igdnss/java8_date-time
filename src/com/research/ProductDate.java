package com.research;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ProductDate {
	public static void main(String[] args) {
		//��ǰ����
		Date currentDate = new Date();
		//������תΪlong,������㣨�Ը���ά��Ϊ������
		long currentTime = currentDate.getTime();
		
		//������Ʒ��������
		Calendar productDate1 = Calendar.getInstance();
		//calendar���·ݴ�0��ʼ�ģ�����10�¶�Ӧ��Ӧ����9��ը�ˡ�����
		productDate1.set(2019, 9, 12);
		//��calendar ת��Ϊdate
		Date productDateFinal = productDate1.getTime();
		long productDateFinalTime = productDateFinal.getTime();
		//���������������������ȥ���������֪���Բ��ԡ���ըһ��
		long intervalDay1 = (currentTime-productDateFinalTime)/1000/60/60/24;
		System.out.println("�ϰ汾ʵ����Ʒ��������У�"+intervalDay1+"��");
		
		//java8 ʵ��,һ�д���
		long intervalDay2 = ChronoUnit.DAYS.between(LocalDate.of(2019, 10, 12), LocalDate.now());
		System.out.println("java8ʵ����Ʒ��������У�"+intervalDay2+"��");
	}
}
