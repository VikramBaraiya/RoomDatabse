package Yadunandan.roomdatabse;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface MyDao {
    @Insert
    public void addUser(Users u);

}
