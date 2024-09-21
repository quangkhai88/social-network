package network.controller;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author Quang-Khai TRAN
 * @date 22/09/2024
 */


@Data
@Builder
public class WallResponseDto {

    private final List<String> posts;

}
