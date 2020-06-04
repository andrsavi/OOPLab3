package po83.savinov.oop.model;

public class WeightTraining extends AbstractExercise implements ComplexExercise {
    private WeightTraining.Node head;
    private WeightTraining.Node tail;
    private int size;
    private int duration;

    public WeightTraining(String name) {
        this.head = null;
        this.tail = null;
    }

    public WeightTraining(String name, Approach[] approaches) {
        Approach[] var3 = approaches;
        int var4 = approaches.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Approach approache = var3[var5];
            this.add(approache);
            ++this.size;
        }

    }

    public WeightTraining(String name, Equipments equipments) {
        super(name, equipments);
    }

    private WeightTraining.Node removeNode(int index) {
        WeightTraining.Node n = this.head;
        int count = 0;
        if (index == 0) {
            this.head = n.next;
            --this.size;
            return n;
        } else {
            while(n != null) {
                if (count + 1 == index) {
                    WeightTraining.Node res = n.next;
                    n.next = n.next.next;
                    res.next = null;
                    --this.size;
                    return res;
                }

                ++count;
                n = n.next;
            }

            return null;
        }
    }

    private WeightTraining.Node getNode(int index) {
        WeightTraining.Node n = this.head;

        for(int count = 0; n != null; n = n.next) {
            if (count == index) {
                return n;
            }

            ++count;
        }

        return null;
    }

    private void addNode(int index, WeightTraining.Node node) {
        WeightTraining.Node n = this.head;

        for(int count = 0; n != null; n = n.next) {
            if (count + 1 == index) {
                WeightTraining.Node temp = n.next;
                n.next = node;
                node.next = temp;
                ++this.size;
                return;
            }

            ++count;
        }

    }

    private void addNode(WeightTraining.Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            node.next = this.head;
            this.head = node;
        }

        ++this.size;
    }

    private void setNode(int index, WeightTraining.Node node) {
        WeightTraining.Node n = this.head;

        for(int count = 0; n != null; n = n.next) {
            if (count + 1 == index) {
                WeightTraining.Node temp = n.next.next;
                n.next = node;
                node.next = temp;
            }

            ++count;
        }

    }

    public int getDuration() {
        int sum = 0;
        Approach[] approaches = this.getApproaches();

        for(int i = 0; i < approaches.length; ++i) {
            sum += approaches[i].getDuration();
        }

        return sum;
    }

    public void setDuration(int duration) {
    }

    public boolean add(Approach approach) {
        this.addNode(new WeightTraining.Node(approach));
        return true;
    }

    public Approach remove() {
        return this.removeNode(0).value;
    }

    public Approach approach() {
        return this.head.value;
    }

    public boolean add(int index, Approach approach) {
        this.addNode(index, new WeightTraining.Node(approach));
        return true;
    }

    public Approach getApproach(int index) {
        return this.getNode(index).value;
    }

    public void setApproach(int index, Approach approach) {
        this.setNode(index, new WeightTraining.Node(approach));
    }

    public Approach remove(int index) {
        return this.removeNode(index).value;
    }

    public int size() {
        return this.size;
    }

    public Approach[] getApproaches() {
        Approach[] returnArr = new Approach[this.size];
        WeightTraining.Node n = this.head;

        for(int i = 0; n != null; n = n.next) {
            returnArr[i] = n.value;
            ++i;
        }

        return returnArr;
    }

    public double[] approachWeights() {
        Approach[] approaches = this.getApproaches();
        double[] approachWeights = new double[approaches.length];

        for(int i = 0; i < approaches.length; ++i) {
            approachWeights[i] = approaches[i].getWeight();
        }

        return approachWeights;
    }

    public int[] approachRepetitions() {
        Approach[] approaches = this.getApproaches();
        int[] approachQuantities = new int[approaches.length];

        for(int i = 0; i < approaches.length; ++i) {
            approachQuantities[i] = approaches[i].getNumOfRepetitions();
        }

        return approachQuantities;
    }

    public Approach remove(Approach approach) {
        for(WeightTraining.Node n = this.head; n != null; n = n.next) {
            if (approach == n.value) {
                WeightTraining.Node res = n.next;
                n.next = n.next.next;
                res.next = null;
                --this.size;
                return res.value;
            }
        }

        return null;
    }

    private class Node {
        public WeightTraining.Node next;
        Approach value;

        public Node(Approach approach) {
            this.value = approach;
        }
    }
}
