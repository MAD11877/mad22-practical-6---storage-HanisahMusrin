package sg.edu.np.mad.hanisah.listactivity;

import android.os.Parcel;
import android.os.Parcelable;

//Create a User class based on the class diagram given
public class User implements Parcelable
{
    String name;
    String description;
    int id;
    boolean followed;

    protected User(Parcel in) {
        name = in.readString();
        description = in.readString();
        id = in.readInt();
        followed = in.readByte() != 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeInt(id);
        parcel.writeByte((byte) (followed ? 1 : 0));
    }
}
