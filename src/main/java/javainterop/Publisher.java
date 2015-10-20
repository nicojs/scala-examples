package javainterop;

public class Publisher {
    private String _name;
    private String _country;

    public Publisher(String name, String country) {
        _name = name;
        _country = country;
    }

    public String getName() {
        return _name;
    }
    public void setName(String _name) {
        this._name = _name;
    }

    public String getCountry() {
        return _country;
    }
    public void setCountry(String _country) {
        this._country = _country;
    }
}
