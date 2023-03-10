public class Main {

    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();

        Player cassettePlayer = new CassettePlayer();
        Player vhsPlayer = new VHSPlayer();
        Player cdPlayer = new CDPlayer();

        playerService.setPlayer(cassettePlayer);
        playerService.play(); // Play Cassette!

        playerService.setPlayer(vhsPlayer);
        playerService.play(); // Play VHS!

        playerService.setPlayer(cdPlayer);
        playerService.play();// Play CD!
    }
}
