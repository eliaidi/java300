package com.hephec.java�������;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class TestGenericRef {
	/**
	 * Javaͨ��ָ�����Ӧ��Class���󣬳�����Ի�ø��������������Field,���ܸ�Fieldʹ��private���Σ�����public����
	 * ���Filed����󣬾Ϳ��Ժ����׵Ļ�ø�Filed���������ͣ�������Ľ������ǻ�ø�Field����field����
	 * Class<?> type=filed.getType();
	 *	����ͨ����ֻ�з���ֻ�Ƕ���ͨ���͵�Field��Ч�������Field���������ɷ������Ƶ����ͣ���Map<String,Integer>���ͣ�����׼ȷ
	 *	Filed�ķ��Ͳ���
	 *	Ϊ�˻��ָ����Field�ķ������ͣ�Ӧ��ʹ�����·�������ȡָ��Filed�ķ�������
	 *	Type type=field.getGenericType();
	 *	Ȼ��Type����ǿ������ת����ParameterizedType����
	 *	ParameterizedType��������������ͣ�Ҳ���������˷������Ƶ�����
	 *	ParameterizedType���ṩ������������
	 *	1.getRawType():���ر��������Ƶ�����
	 *	2.getActualTypeArguments():���ط��Ͳ�������
	 *	
	 * */
	
	//����ʵ��
	
	@SuppressWarnings("unused")
	private Map<String,Integer> map=new HashMap<String,Integer>();
	
	public static void main(String[] args) throws Exception, SecurityException {
		//��ȡClassʵ��
		Class<TestGenericRef> clazz=TestGenericRef.class;
		
		//����������ȡ�ø����Զ�ӦField��Ӧ��Filed����
		Field mapFiled=clazz.getDeclaredField("map");
		
		//ʾ����һ��������ֱ��ͨ��getType()ȡ��Field�����ͣ�ֻ����ͨ���͵�Field������Ч
		Class<?> mapClazz=mapFiled.getType();
		System.out.println("������Ϊmap����������Ϊ��"+mapClazz);
		
		//ʾ���ڶ��ַ���
		Type mapMainType=mapFiled.getGenericType();
		
		//Ϊ��ȷ������ȫת����ʹ��instanceof
		if(mapMainType instanceof ParameterizedType){
		
			//ִ��ǿ������ת��
			ParameterizedType parameterziedType=(ParameterizedType) mapMainType;
			
			//��ȡ����������Ϣ����Map
			Type basicType=parameterziedType.getRawType();
			System.out.println("��������Ϊ��"+basicType);
			
			//��ȡ�������͵ķ��Ͳ���
			Type[] types=parameterziedType.getActualTypeArguments();
			
			for (int i = 0; i < types.length; i++) {
				System.out.println("��"+i+"�����Ͳ�������"+types[i]);
			}
		}
	}
}
