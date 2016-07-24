package database.dao;

import com.chaoyuan.database.dao.QuestionDao;
import com.chaoyuan.database.type.QuestionDB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

/**
 * Created by yc on 2016/7/24.
 */
public class TestQuestionDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring/mybatis-*.xml");
    QuestionDao dao = (QuestionDao)context.getBean("questionMysqlDao");

    @Test
    public void testSave() throws Exception {
        for (long i = 1000; i <= 100000; i+=1000) {
            QuestionDB db = new QuestionDB();
            db.setDescription(String.valueOf(i));
            db.setAnswerTemplate(String.valueOf(i));
            long id = dao.save(db);
            System.out.println(id);
        }
    }

    @Test
    public void testUpdate() throws Exception {
        QuestionDB db = new QuestionDB();
        db.setDescription("362202198901254432");
        db.setAnswerTemplate("chaoyuan");
        long id = dao.save(db);
        db.setAnswerTemplate("chaoyuan1");
        dao.update(db);
        QuestionDB db1 = dao.get(id);
        Assert.isTrue(db1.getAnswerTemplate().equals("chaoyuan1"));
    }

    @Test
    public void testDelete() throws Exception {
        QuestionDB db = new QuestionDB();
        db.setDescription("362202198901254432");
        db.setAnswerTemplate("chaoyuan");
        long id = dao.save(db);
        dao.delete(id);
        QuestionDB db1 = dao.get(id);
        Assert.isNull(db1);
    }
}
