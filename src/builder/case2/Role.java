package builder.case2;

/**
 * @author halo.
 * @email ironerhalo@gmail.com.
 * @data 2019/10/13 11:07.
 */
public class Role {
    //ͷ��
    private String head;
    // ����
    private String face;
    // ����
    private String body;
    // ����ֵ
    private Double hp;
    // ����ֵ
    private Double sp;
    // ħ��ֵ
    private Double mp;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Double getHp() {
        return hp;
    }

    public void setHp(Double hp) {
        this.hp = hp;
    }

    public Double getSp() {
        return sp;
    }

    public void setSp(Double sp) {
        this.sp = sp;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }
    @Override
    public String toString() {
        return "Role{" +
                "head='" + head + '\'' +
                ", face='" + face + '\'' +
                ", body='" + body + '\'' +
                ", hp=" + hp +
                ", sp=" + sp +
                ", mp=" + mp +
                '}';
    }
}
