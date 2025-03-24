class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        // Parse the start and end times for event1
        int n1 = Integer.parseInt(event1[0].substring(0, 2)); // Hours
        int n2 = Integer.parseInt(event1[0].substring(3, 5)); // Minutes
        int n3 = Integer.parseInt(event1[1].substring(0, 2)); // Hours
        int n4 = Integer.parseInt(event1[1].substring(3, 5)); // Minutes
        
        int t1 = n1 * 60 + n2; // Start time in minutes
        int t2 = n3 * 60 + n4; // End time in minutes
        
        // Parse the start and end times for event2
        int n5 = Integer.parseInt(event2[0].substring(0, 2)); // Hours
        int n6 = Integer.parseInt(event2[0].substring(3, 5)); // Minutes
        int n7 = Integer.parseInt(event2[1].substring(0, 2)); // Hours
        int n8 = Integer.parseInt(event2[1].substring(3, 5)); // Minutes
        
        int t3 = n5 * 60 + n6; // Start time in minutes
        int t4 = n7 * 60 + n8; // End time in minutes

        // Check if the events overlap
        return !(t2 < t3 || t4 < t1);
    }
}
