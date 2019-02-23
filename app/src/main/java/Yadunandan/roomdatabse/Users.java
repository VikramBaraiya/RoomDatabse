package Yadunandan.roomdatabse;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class Users {
    @PrimaryKey
    private int Id;
    @ColumnInfo(name = "NAME")
    private String Name;
    @ColumnInfo(name = "EMAIL")
    private String Email;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
