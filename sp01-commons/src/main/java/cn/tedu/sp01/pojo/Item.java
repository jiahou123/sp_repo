package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  
@NoArgsConstructor //�޲ι���
@AllArgsConstructor //ȫ�ι���
public class Item {
	//���
	private Integer id;
	//����
	private String name;
	private Integer number;
}

