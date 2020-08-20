package models.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public record AuthorsJson(@JsonProperty("author") @SerializedName("author") List<AuthorJson> author) {

}
