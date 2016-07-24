package database.dao;

import com.chaoyuan.database.dao.AnswerDao;
import com.chaoyuan.database.type.AnswerDB;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;
import org.testng.annotations.Test;

/**
 * Created by yc on 2016/7/24.
 */
public class TestAnswerDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring/mybatis-*.xml");
    AnswerDao dao = (AnswerDao)context.getBean("answerMysqlDao");

    @Test
    public void testSave() throws Exception {
        for (long i = 1000; i <= 100000; i+=1000) {
            AnswerDB db = new AnswerDB();
            db.setAnswer("362202198901254432");
            long id = dao.save(db);
            System.out.println(id);
        }
    }

    @Test
    public void testUpdate() throws Exception {
        AnswerDB db = new AnswerDB();
        db.setAnswer("362202198901254432");
        long id = dao.save(db);
        db.setAnswer("chaoyuan1");
        dao.update(db);
        AnswerDB db1 = dao.get(id);
        Assert.isTrue(db1.getAnswer().equals("chaoyuan1"));
    }

    @Test
    public void testDelete() throws Exception {
        AnswerDB db = new AnswerDB();
        db.setAnswer("362202198901254432");
        long id = dao.save(db);
        dao.delete(id);
        AnswerDB db1 = dao.get(id);
        Assert.isNull(db1);
    }
}
