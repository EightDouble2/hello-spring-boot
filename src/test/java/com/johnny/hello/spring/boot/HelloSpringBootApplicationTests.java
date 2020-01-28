package com.johnny.hello.spring.boot;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.johnny.hello.spring.boot.domain.TbTest;
import com.johnny.hello.spring.boot.mapper.TbTestMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HelloSpringBootApplicationTests {

	@Autowired
	private TbTestMapper tbTestMapper;

	@Test
	void contextLoads() {
		System.out.println("Hello Spring Boot");
	}

	@Test
	public void tbTestSelectAll() {
		List<TbTest> tbTests = tbTestMapper.selectAll();
		tbTests.forEach(tbTest -> {
			System.out.println(tbTest);
		});
	}

	@Test
	public void tbTestInsert() {
		TbTest tbTest = new TbTest();
		tbTest.setId("3");
		tbTest.setName("Happy");

		tbTestMapper.insert(tbTest);
	}

	@Test
	public void tbTestUpdate() {
		TbTest tbTest = tbTestMapper.selectByPrimaryKey(1);
		tbTest.setName("JohnnyHao");

		tbTestMapper.updateByPrimaryKey(tbTest);
	}

	@Test
	public void tbTestDelete() {
		tbTestMapper.deleteByPrimaryKey(3);
	}

	@Test
	public void tbTestPage() {
		PageHelper.startPage(1, 1);
		PageInfo<TbTest> tbTestPageInfo = new PageInfo<>(tbTestMapper.selectAll());
		System.out.println(tbTestPageInfo);
	}
}
