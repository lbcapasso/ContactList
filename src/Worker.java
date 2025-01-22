public class Worker extends Person
{
    private String job;

    public Worker (String first, String last, String number, String newJob)
    {
        super (first, last, number);
        job = newJob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String toString()
    {
        return super.toString() + job;
    }
}
