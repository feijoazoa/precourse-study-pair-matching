package pairmatching.controller

import net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver.Matching
import pairmatching.MatchingService
import pairmatching.model.Data
import pairmatching.model.Service

class PairMatching {
    private val data = Data()
    private val matchingService = MatchingService()
    fun start() {
        data.readFile()
        while (true) {
            when (matchingService.choose()) {
                Service.FIRST.getChoice() -> matchingService.getMatching()
                Service.SECOND.getChoice() -> matchingService.showPairs()
                Service.THIRD.getChoice() -> matchingService.initPairs()
                Service.QUIT.getChoice() -> break
            }
        }
    }
}