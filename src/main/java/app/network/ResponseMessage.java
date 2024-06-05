package app.network;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseMessage {

    DELETED("Deleted."),
    SOMETHING_WRONG("Something wrong.");

    private final String responseMsg;
}
