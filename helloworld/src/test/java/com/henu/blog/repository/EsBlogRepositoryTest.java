package com.henu.blog.repository;

import com.henu.blog.domain.EsBlog;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsBlogRepositoryTest {

    @Autowired
    private EsBlogRepository esBlogRepository;


    @Before
    public void initRepositoryData() {
        // 清除所有数据
        esBlogRepository.deleteAll();
        esBlogRepository.save(new EsBlog("佳人", "杜甫的佳人", "绝代有佳人，幽居在空谷。\n" +
                "自云良家子，零落依草木。" +
                "关中昔丧乱，兄弟遭杀戮。" +
                "官高何足论，不得收骨肉。" +
                "世情恶衰歇，万事随转烛。" +
                "夫婿轻薄儿，新人美如玉。" +
                "合昏尚知时，鸳鸯不独宿。" +
                "但见新人笑，那闻旧人哭！" +
                "在山泉水清，出山泉水浊。" +
                "侍婢卖珠回，牵萝补茅屋。" +
                "摘花不插发，采柏动盈掬。" +
                "天寒翠袖薄，日暮倚修竹。"));
        esBlogRepository.save(new EsBlog("梦李白", "杜甫的梦李白","死别已吞声，生别常恻恻。\n" +
                "江南瘴疠地，逐客无消息。" +
                "故人入我梦，明我长相忆。" +
                "君今在罗网，何以有羽翼？" +
                "恐非平生魂，路远不可测。" +
                "魂来枫林青，魂返关塞黑。" +
                "落月满屋梁，犹疑照颜色。" +
                "水深波浪阔，无使蛟龙得。"));

        esBlogRepository.save(new EsBlog("相思", "王维的相思","红豆生南国，春来发几枝。愿君多采撷，此物最相思。"));
    }

    @Test
    public void testFindDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining() {
        Pageable pageable = new PageRequest(0, 20);
        String title = "思";
        String summary = "相思";
        String content = "相思";
        Page<EsBlog> page = esBlogRepository.findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContaining(title, summary, content, pageable);
        assertThat((page.getTotalElements())).isEqualTo(1);

        System.out.println("Start");
        for (EsBlog blog : page.getContent()) {
            System.out.println(blog.toString());
        }
        System.out.println("end");
    }

}