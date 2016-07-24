package database.dao;

import com.chaoyuan.database.dao.ParticipantDao;
import junit.framework.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;
import com.chaoyuan.database.type.ParticipantDB;

import java.util.List;

/**
 * Created by chaoyuan on 02/23/2016.
 */
public class TestParticipantDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring/mybatis-*.xml");
    ParticipantDao dao = (ParticipantDao)context.getBean("participantMysqlDao");

    @Test
    public void testSave() throws Exception {
        for (long i = 1000; i <= 100000; i+=1000) {
            ParticipantDB db = new ParticipantDB();
            db.setIDNumber("362202198901254432");
            db.setName("chaoyuan");
            long id = dao.save(db);
            System.out.println(id);
        }
    }

    @Test
    public void testGetByIDNumber() throws Exception {
        ParticipantDB db = new ParticipantDB();
        db.setIDNumber("362202198901254432");
        List<ParticipantDB> list = dao.getByIDNumber(db);
        Assert.assertNotNull(list);
    }

    @Test
    public void testUpdate() throws Exception {
        ParticipantDB db = new ParticipantDB();
        db.setIDNumber("362202198901254432");
        db.setName("chaoyuan");
        dao.save(db);
        db.setName("chaoyuan1");
        dao.update(db);
    }

    @Test
    public void testDelete() throws Exception {
        ParticipantDB db = new ParticipantDB();
        db.setIDNumber("362202198901254432");
        db.setName("chaoyuan");
        long id = dao.save(db);
        db.setName("chaoyuan1");
        dao.delete(id);
    }
}
