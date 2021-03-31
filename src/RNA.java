public class ARN {

    // Attributes
    private String sequence;
    private String matching;

    // Constructors
    public ARN(String sequence, String matching) throws sizeNotCorrectException {
        if (sequence.length() != matching.length()){
            throw new sizeNotCorrectException();
        }
        else {
            this.sequence = sequence;
            this.matching = matching;
        }
    }

    public ARN(String sequence){
        this.sequence = sequence;
        this.matching = null;
    }

    // Methods
    public String getSequence(){
        return this.sequence;
    }

    public String getMatching(){
        return this.matching;
    }

    public void setMatching(String matching) throws sizeNotCorrectException {
        if (this.sequence.length() != matching.length()){
            throw new sizeNotCorrectException();
        }
        else {
            this.matching = matching;
        }
    }

    public boolean equals(ARN sequence2){
        return this.matching.equals(sequence2.getMatching());
    }

    public boolean perfectlyEquals(ARN sequence2){
        return this.equals(sequence2) && this.sequence.equals(sequence2.getSequence());
    }

    @Override
    public String toString(){
        String result;
        result = "sequence : " + this.sequence + "\n";
        if (this.matching != null){
            result += "matching : " + this.matching;
        }
        return result;
    }


    public static void main(String args[]) throws sizeNotCorrectException {
        ARN seq1 = new ARN("ATCGGCTCGA");
        seq1.setMatching("((------))");
        System.out.println(seq1);
        ARN seq2 = new ARN("ATCGGCACGA");
        seq2.setMatching("((------))");
        System.out.println(seq1.equals(seq2));
        Arbre tree= new Arbre();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left=new Node(4);
        tree.printNodes(tree.root,1, 3);

    }

}