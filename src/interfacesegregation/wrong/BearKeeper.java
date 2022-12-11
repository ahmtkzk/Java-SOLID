package interfacesegregation.wrong;

/*
* The 'I' in SOLID stands for interface segregation, and it simply means that larger
* interfaces should be split into smaller ones.
* By doing so, we can ensure that implementing
* classes only need to be concerned about the methods that are of interest to them.
* */
public interface BearKeeper {

    //Bear keeper doing all the jobs below. But there are many of one worker for doing this jobs.
    //One keeper washing bear, not pet the bear. So, we have to separate.
    void washTheBear();
    void feedTheBear();
    void petTheBear();

}
