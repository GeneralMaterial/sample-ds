package aws.s3;

import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class S3Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void getObjectsFromBucket(String bucketName){
		AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
		
		ListObjectsV2Result results = s3.listObjectsV2(bucketName);
		List<S3ObjectSummary> summaries=results.getObjectSummaries();
		
		for(S3ObjectSummary summary : summaries){
			System.out.println(" * " + summary.getKey());
		}
		
		
	}
	

}
