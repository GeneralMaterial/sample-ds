package aws.s3;

import java.util.List;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;

public class S3CRUD {

	public static void main(String[] args) {
		System.out.println("main...");
		String bucket_name = "vbs3bucket";
		S3CRUD s3 = new S3CRUD();
		s3.createBucket(bucket_name);
		Bucket b = s3.getBucket(bucket_name);
		if(b !=null){
			S3Objects objects = new S3Objects();
			objects.getObjectsFromBucket(bucket_name);
		}
		s3.deleteBucket(bucket_name);

	}

	public void createBucket(String bucket_name) {
		final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();

		if (s3.doesBucketExistV2(bucket_name)) {
			System.out.println("Bucket exists with name: " + bucket_name);

		} else {
			try {
				System.out.println("creating.....");
				s3.createBucket(bucket_name);
			} catch (AmazonS3Exception ex) {
				System.err.println(ex.getErrorMessage());
			}
		}

	}

	public Bucket getBucket(String bucket_name) {
		System.out.println("in method get.....");

		final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
		Bucket named_bucket = null;
		List<Bucket> buckets = s3.listBuckets();
		for (Bucket b : buckets) {
			System.out.println("bucket in space - " + b.getName());
			if (b.getName().equals(bucket_name)) {
				named_bucket = b;
			}
		}
		return named_bucket;

	}

	public void deleteBucket(String bucket_name) {

		final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
		try {
			if (getBucket(bucket_name) != null) {
				s3.deleteBucket(bucket_name);
			} else {
				System.out.println("Mentioned bucket doesnt exist ");
			}
		} catch (AmazonServiceException ase) {
			System.err.println(ase.getErrorMessage());
		}
	}

}
