import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by summer on 16-1-17.
 */
public class TestSp01 {
    public static void main(String[] args){
        CloseableHttpClient httpClient= HttpClients.createDefault();
        HttpPost post=new HttpPost("http://www.cnblogs.com/Summer7C/p/5138156.html");
        try {
            CloseableHttpResponse response=httpClient.execute(post);
            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<NameValuePair> formparams=new ArrayList<NameValuePair>();
        formparams.add(new BasicNameValuePair("UserName","root"));
        formparams.add(new BasicNameValuePair("Password","callabroot"));
        UrlEncodedFormEntity entity=new UrlEncodedFormEntity(formparams, Consts.UTF_8);
        post.setEntity(entity);


    }
}
