package interfacesegregation.correct;

public class BearCarer implements BearCleaner, BearFeeder {

    @Override
    public void washTheBear() {
        //Bear carer's job are washing and feeding the bear. Not to domesticate.
    }

    @Override
    public void feedTheBear() {
        //Bear carer's job are washing and feeding the bear. Not to domesticate.
    }

}
