import java.util.*;

class StationManager {
    Map<String, List<Station>> stationMap = new HashMap<>();

    public void addStation(String type, String location, int units) {
        stationMap.putIfAbsent(type, new ArrayList<>());
        stationMap.get(type).add(new Station(type, location, units));
    }

    public Station getAvailableStation(String type, String location) {
        List<Station> stations = stationMap.getOrDefault(type, new ArrayList<>());
        for (Station s : stations) {
            if (s.availableUnits > 0) {
                return s;
            }
        }
        return null;
    }
}
