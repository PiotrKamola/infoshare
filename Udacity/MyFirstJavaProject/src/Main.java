class Main {
    public static void main(String [] args){
        //System.out.println("Hello world!");
        ContactsManager myContactManager = new ContactsManager();

        Contact myFriendZero = new Contact();
        myFriendZero.name = "Friend0";
        myFriendZero.phoneNumber = "00000000000000";
        myContactManager.addContact(myFriendZero);

        Contact myFriendOne = new Contact();
        myFriendOne.name = "Friend1";
        myFriendOne.phoneNumber = "11111111111";
        myContactManager.addContact(myFriendOne);

        Contact myFriendTwo = new Contact();
        myFriendTwo.name = "Friend2";
        myFriendTwo.phoneNumber = "222222222222";
        myContactManager.addContact(myFriendTwo);

        Contact myFriendThree = new Contact();
        myFriendThree.name = "Friend3";
        myFriendThree.phoneNumber = "3333333333333";
        myContactManager.addContact(myFriendThree);

        System.out.println(myContactManager.searchContact("Friend1").phoneNumber);  // Friend exist

        Contact foundFriend = myContactManager.searchContact("Friend3");    // Another solution
        System.out.println(foundFriend.phoneNumber);

        myContactManager.searchContact("FriendOne");
        try {
            System.out.println(myContactManager.searchContact("FriendOne").phoneNumber); // Friend not exist
        }
        catch(NullPointerException a){
            System.out.println("Friend not exist.");
        }
    }
}